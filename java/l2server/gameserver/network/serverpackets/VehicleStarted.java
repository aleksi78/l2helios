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

import l2server.gameserver.model.actor.L2Character;

/**
 * @author Kerberos
 */
public class VehicleStarted extends L2GameServerPacket
{
    private int _objectId;
    private int _state;

    /**
     */
    public VehicleStarted(L2Character boat, int state)
    {
        _objectId = boat.getObjectId();
        _state = state;
    }

    /*
     * (non-Javadoc)
     *
     * @see l2server.gameserver.serverpackets.ServerBasePacket#writeImpl()
     */
    @Override
    protected final void writeImpl()
    {
        writeD(_objectId);
        writeD(_state);
    }
}
