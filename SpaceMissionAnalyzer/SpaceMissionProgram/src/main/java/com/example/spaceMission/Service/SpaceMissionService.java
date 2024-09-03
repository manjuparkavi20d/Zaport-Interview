package com.example.spaceMission.Service;

@Service
public class SpaceMissionService {

    @Autowired
    private SpaceMissionRepository spaceMissionRepository;

    public SpaceMissionModel logMission(SpaceMissionModel mission) {
        return spaceMissionRepository.save(mission);
    }

    public SpaceMissionModel getLatestMission(){
        return repository.findTopOrderByLaunchDateDesc();
    }

    public SpaceMissionModel getMissionStatus(String missionType){
        return repository.findTopOrderByLaunchDateDesc();
    }
}