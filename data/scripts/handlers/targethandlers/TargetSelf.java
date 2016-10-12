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

package handlers.targethandlers;

import l2server.gameserver.handler.ISkillTargetTypeHandler;
import l2server.gameserver.handler.SkillTargetTypeHandler;
import l2server.gameserver.model.L2Object;
import l2server.gameserver.model.L2Skill;
import l2server.gameserver.model.actor.L2Character;
import l2server.gameserver.templates.skills.L2SkillTargetType;

/**
 * @author nBd
 */
public class TargetSelf implements ISkillTargetTypeHandler
{

    /**
     */
    @Override
    public L2Object[] getTargetList(L2Skill skill, L2Character activeChar, boolean onlyFirst, L2Character target)
    {
        return new L2Character[]{activeChar};
    }

    /**
     */
    @Override
    public Enum<L2SkillTargetType> getTargetType()
    {
        // TODO Auto-generated method stub
        return L2SkillTargetType.TARGET_SELF;
    }

    public static void main(String[] args)
    {
        SkillTargetTypeHandler.getInstance().registerSkillTargetType(new TargetSelf());
    }
}
