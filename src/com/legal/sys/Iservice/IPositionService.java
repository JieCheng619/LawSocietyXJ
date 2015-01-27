package com.legal.sys.Iservice;
import java.util.List;

import com.legal.sys.domain.Position;


public interface IPositionService {
	public void add(Position pos);
	
	public void update(Position pos);
	
	public void delete(int id);
	
	public Position load(int id);
	
	public List<Position> find();
	
	public List<Position> listByOrg(int orgId);
}
