package com.legal.sys.Idao;
import java.util.List;
import com.legal.basices.dao.inter.IBaseDao;
import com.legal.basices.model.Pager;
import com.legal.sys.domain.Person;
import com.legal.sys.domain.PersonOrgPos;
import com.legal.sys.dto.PersonDto;


public interface IPersonDao extends IBaseDao<Person> {
	/**
	 * 根据组织和岗位来获取所有的人员,组织id必须存在，岗位id如果不存在获取这个组织中的所有人员
	 * @param oid
	 * @return
	 */
	public Pager<Person> findByOrg(int oid,Integer posId);
	
	public Pager<PersonDto> findPersonAndPosByOrg(int oid,Integer posId);
	
	public List<PersonDto> listPersonAndPosByOrg(int oid,Integer posId);
	
	public void addPersonOrgPos(PersonOrgPos pop);
}
