package com.legal.sys.Idao;
import java.util.List;

import com.legal.basices.dao.inter.IBaseDao;
import com.legal.sys.domain.Position;


public interface IPositionDao extends IBaseDao<Position> {
	public List<Position> find();
	public Position loadBySn(String sn);
	/**
	 * 获取某个组织中存在的所有岗位列表
	 * @param orgId
	 * @return
	 */
	public List<Position> listByOrg(int orgId);
}
