package com.TraineeManagement.service;

import java.util.List;

import com.TraineeManagement.trainee.Trainee;
import com.TraineeManagement.trainee.TraineeDao;
import com.TraineeManagement.trainee.TraineeDaoImpl;

public class TraineeServiceImpl implements TraineeService{
	private TraineeDao traineeDao;
	
	
	public TraineeServiceImpl() {
		this.traineeDao=new TraineeDaoImpl();
	}

	@Override
	public List<Trainee> allTrainees() {
		
		return traineeDao.allTrainees();
	}

	@Override
	public Trainee addTrainee(Trainee trainee) {
		return traineeDao.addTrainee(trainee);
	}

	@Override
	public Trainee getTraineeById(int id) {
		return traineeDao.getTraineeById(id);
	}

}
