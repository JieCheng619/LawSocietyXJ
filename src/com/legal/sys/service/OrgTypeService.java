package com.legal.sys.service;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.legal.sys.Idao.IOrgDao;
import com.legal.sys.Idao.IOrgTypeDao;
import com.legal.sys.Iservice.IOrgTypeService;
import com.legal.sys.domain.OrgType;
import com.legal.sys.domain.SysException;
import com.legal.sys.dto.InitOrgTypeRuleDto;
import com.legal.sys.dto.OrgTypeDto;
import com.legal.sys.dto.OrgTypeRuleDto;

@Service("orgTypeService")
public class OrgTypeService extends AbstractBaseService implements IOrgTypeService {
	@Inject
	private IOrgTypeDao orgTypeDao;
	@Inject
	private IOrgDao orgDao;
	
	@Override
	public void add(OrgType orgType) {
		if(orgTypeDao.loadBySn(orgType.getSn())!=null)
			throw new SysException("要添加的组织机构类型的sn已经存在");
		orgTypeDao.add(orgType);
	}

	@Override
	public void update(OrgType orgType) {
		orgTypeDao.update(orgType);
	}

	@Override
	public void delete(int id) {
		int c = orgDao.getOrgNumsByType(id);
		if(c>0) throw new SysException("要删除的组织机构类型中有组织存在，不能删除");
		System.out.println(c);
		orgTypeDao.delete(id);
	}

	@Override
	public OrgType load(int id) {
		return orgTypeDao.load(id);
	}

	@Override
	public List<OrgType> list() {
		return orgTypeDao.list();
	}

	@Override
	public OrgType loadBySn(String sn) {
		return orgTypeDao.loadBySn(sn);
	}

	@Override
	public void addOrgTypeRule(int pid, int cid, int num) {
		orgTypeDao.addOrgTypeRule(pid, cid, num);
	}

	@Override
	public void deleteOrgTypeRule(int pid, int cid) {
		orgTypeDao.deleteOrgTypeRule(pid, cid);
	}

	@Override
	public void updateOrgTypeRule(int pid, int cid, int num) {
		orgTypeDao.updateOrgTypeRule(pid, cid, num);
	}

	@Override
	public List<OrgType> listByRule(int pid) {
		return orgTypeDao.listByRule(pid);
	}

	@Override
	public int loadOrgRuleNum(int pid, int cid) {
		return orgTypeDao.loadOrgRuleNum(pid, cid);
	}

	@Override
	public void addOrgTypeRule(InitOrgTypeRuleDto dto) {
		orgTypeDao.addOrgTypeRule(orgTypeDao.loadBySn(dto.getPsn()).getId(), 
								  orgTypeDao.loadBySn(dto.getCsn()).getId(), 
								  dto.getNum());
	}

	@Override
	public List<OrgTypeDto> listChildType(int pid) {
		return orgTypeDao.listChildType(pid);
	}

	@Override
	public List<OrgTypeRuleDto> listOrgTypeRuleByOrg(int id) {
		return orgTypeDao.listOrgTypeRuleByOrg(id);
	}

}
