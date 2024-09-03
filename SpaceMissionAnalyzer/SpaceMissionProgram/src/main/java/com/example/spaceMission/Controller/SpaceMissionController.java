package com.example.spaceMission.Controller;

@RestController
@RequestMapping("/api/missions")
public class SpaceMissionController {

    @Autowired
    private SpaceMissionService service;

    @PostMapping
    public ResponseEntity<SpaceMissionModel> logMission(@RequestBody SpaceMissionModel mission){
        SpaceMissionModel createMission = service.logMission(mission);
        return new ResponseEntity<>(createMission, HttpStatus.CREATED);
    }

    @GetMapping("/stats")
    public ResponseEntity<MissionStatus> getMissionstatus(@RequestParam(required = false) String missionType) {
        MissionStatus stats = service.getMissionStatus(missionType);
        return ResponseEntity.ok(stats);
    }

    @GetMapping("/latest")
    public ResponseEntity<SpaceMissionModel> getLatestMission(){
        SpaceMissionModel latestMission = service.getLatestMission();
        return ResponseEntity.ok(latestMission);
    }
}
