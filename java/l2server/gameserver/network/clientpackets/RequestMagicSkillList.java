package l2server.gameserver.network.clientpackets;

/**
 * @author Pere
 */
public class RequestMagicSkillList extends L2GameClientPacket
{
	@Override
	public void readImpl()
	{
	}

	@Override
	public void runImpl()
	{
		//Log.info(getType() + " packet was received from " + getClient() + ".");
	}
}
