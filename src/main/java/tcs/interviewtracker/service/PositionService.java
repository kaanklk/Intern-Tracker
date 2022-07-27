package tcs.interviewtracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import tcs.interviewtracker.DTOs.PositionDTO;
import tcs.interviewtracker.persistence.Position;
import tcs.interviewtracker.repository.PositionRepository;

@Service
public class PositionService {

    PositionRepository positionRepository;


    public PositionService(PositionRepository positionRepository) {
        this.positionRepository = positionRepository;
    }


    public List<PositionDTO> findAll() {
        return positionRepository.findAll();
    }

}
