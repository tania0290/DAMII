package com.cibertec.assessment.service;

import java.util.List;


import com.cibertec.assessment.beans.SquareBean;
import com.cibertec.assessment.model.Square;

public interface SquareService {

	public Square create(Square s);
	
	public void create(List<Square> ls);
	
	//public List<Square> list();
	
	public List<SquareBean> list();
	public void delete(int id);
}
