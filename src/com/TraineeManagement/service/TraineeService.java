package com.TraineeManagement.service;

import java.util.List;

import com.TraineeManagement.trainee.Trainee;

public interface TraineeService {
	public List<Trainee> allTrainees();

	public Trainee addTrainee(Trainee trainee);

	public Trainee getTraineeById(int id);
}
