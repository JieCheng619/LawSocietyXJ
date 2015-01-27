package com.legal.sys.dao;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.legal.basices.dao.impl.BaseDao;
import com.legal.basices.model.Pager;
import com.legal.sys.Idao.IPersonDao;
import com.legal.sys.domain.Person;
import com.legal.sys.domain.PersonOrgPos;
import com.legal.sys.dto.PersonDto;

@Repository("personDao")
public class PersonDao extends BaseDao<Person> implements IPersonDao {

	@Override
	public Pager<Person> findByOrg(int oid, Integer posId) {
		String hql = "select p from Person p,PersonOrgPos pop where p.id=pop.personId and pop.orgId=? ";
		if(posId!=null) {
			hql+=" and pop.posId="+posId;
		}
		return super.find(hql, oid);
	}


	@Override
	public void addPersonOrgPos(PersonOrgPos pop) {
		super.addEntity(pop);
	}

	@Override
	public Pager<PersonDto> findPersonAndPosByOrg(int oid, Integer posId) {
		String hql = "select new org.konghao.sys.org.dto.PersonDto(p.id,p.name,p.sfzh,p.sex,p.phone,pos.name,pos.id) " +
				"from Person p,PersonOrgPos pop,Position pos where p.id=pop.personId and pos.id=pop.posId and pop.orgId=? ";
		if(posId!=null) {
			hql+=" and pop.posId="+posId;
		}
		return super.findObj(hql, oid);
	}


	@Override
	public List<PersonDto> listPersonAndPosByOrg(int oid, Integer posId) {
		String hql = "select new org.konghao.sys.org.dto.PersonDto(p.id,p.name,p.sfzh,p.sex,p.phone,pos.name,pos.id) " +
				"from Person p,PersonOrgPos pop,Position pos where p.id=pop.personId and pos.id=pop.posId and pop.orgId=? ";
		if(posId!=null) {
			hql+=" and pop.posId="+posId;
		}
		return super.listObj(hql, oid);
	}

}
