/*
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */

package l2server.gameserver.network.serverpackets;

import l2server.gameserver.model.L2ItemInstance;
import l2server.gameserver.model.actor.instance.L2PcInstance;

/**
 * @author Erlandys
 */
public class ExResponseCommissionInfo extends L2GameServerPacket
{

	@SuppressWarnings("unused")
	private L2PcInstance _player;
	@SuppressWarnings("unused")
	private L2ItemInstance _item;
	private boolean _success;

	public ExResponseCommissionInfo(L2PcInstance player, int itemOID, boolean success)
	{
		_player = player;
		_item = player.getInventory().getItemByObjectId(itemOID);
		_success = success;
	}

	@Override
	protected final void writeImpl()
	{
		writeD(_success ? 0x01 : 0x00);
		writeD(0x00); // ItemID
		writeD(0x00); // TODO: Price
		writeQ(0x00); // TODO: Count
		writeD(0x00); // TODO: Duration
		writeD(-1); // TODO: Unknown
		writeD(0x00); // TODO: Unknown
	}
}
