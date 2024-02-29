package com.cibertec.assessment.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.assessment.beans.PolygonBean;
import com.cibertec.assessment.beans.SquareBean;
import com.cibertec.assessment.model.Square;
import com.cibertec.assessment.repo.SquareRepo;
import com.cibertec.assessment.service.PolygonService;
import com.cibertec.assessment.service.SquareService;

@Service
public class SquareServiceImpl implements SquareService{

	@Autowired 
	SquareRepo squareRepo;
	
	@Autowired
	PolygonService polygonService;
	
	//Al momento de crear se debe validar si 
	//alguno de parte del cuadrado se encuentra dentro de algun
	//poligono y de ser asi se debe capturar el id de los poligonos y 
	//guardar como un string pero con formato de array
	//Ejemplo polygons = "["1","2"]"
	//Se guardan los ids correspondites
	//usar los metodos ya existentes para listar polygonos
	
	@Override
	public Square create(Square s) {
		 
	        return squareRepo.save(s);
	}

	private boolean intersectsPolygon(Square square, PolygonBean polygon) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void create( List<Square> ls) {
		squareRepo.saveAll(ls);
	}
	
	@Override
	public List<SquareBean> list() {
		List<Square> list = squareRepo.findAll();
		List<SquareBean> listSquareBeans = new ArrayList<>();
		list.forEach(s -> {
			Integer[] intArrayX = new Integer[4];
			Integer[] intArrayY = new Integer[4];
			Integer[] intArrayP = new Integer[4];
			convertStringInIntegerArray(s.getXPoints(), s.getYPoints(), s.getPolygons(), intArrayX, intArrayY, intArrayP );
			
			SquareBean squareBean = new SquareBean();
			squareBean.setId(s.getId());
			squareBean.setName(s.getName());
			squareBean.setNpoints(s.getNpoints());
			squareBean.setPolygons(intArrayP);
			squareBean.setXPoints(intArrayX);
			squareBean.setYPoints(intArrayY);
			
			listSquareBeans.add(squareBean);
		
		});
		return listSquareBeans;
	}

	
	private void convertStringInIntegerArray(String xPoints, String yPoints ,String polygons,   Integer[] intArrayX, Integer[] intArrayY, Integer[] intArrayP) {

		String cleanedXPoints = xPoints.substring(1, xPoints.length() - 1);
		String cleanedYPoints = yPoints.substring(1, yPoints.length() - 1);
		String cleanedpolygons = polygons.substring(1, polygons.length() - 1);
		
		
		// Split the string by commas
		String[] partsX = cleanedXPoints.split(", ");
		String[] partsY = cleanedYPoints.split(", ");
		String[] partsP = cleanedpolygons.split(", ");

		for (int i = 0; i < partsX.length; i++) {
			intArrayX[i] = Integer.parseInt(partsX[i]);
		}
		
		for (int i = 0; i < partsY.length; i++) {
			intArrayY[i] = Integer.parseInt(partsY[i]);
		}
		for (int i = 0; i < partsP.length; i++) {
			intArrayP[i] = Integer.parseInt(partsP[i]);
		}
	}

	@Override
	public void delete(int id) {
		
		squareRepo.deleteById(id);
		
	}


}
