package dialogflow.api;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dialogflow.model.ActivityEntry;
import dialogflow.model.ActivityRepozytory;

@RestController
public class ActivityHistoryCrudApi {

	@Autowired
	ActivityRepozytory activityRepozytory;
	
	@PostMapping("/entries")
	public ResponseEntity<ActivityEntry> saveActivity(@RequestBody ActivityEntry activityEntry ){
		//dodanie timestamp - na szybko be wydzielania serwisu -zostaje w kontrloerze
		activityEntry.setTimestamp(new Timestamp(System.currentTimeMillis()));
		ActivityEntry newEntry= activityRepozytory.save(activityEntry);
		return ResponseEntity.ok().body(newEntry);
		
	}
	
	@GetMapping("/entries")
	public List<ActivityEntry> getActivityEntries() {
		return (List<ActivityEntry>) activityRepozytory.findAll();
	}
}
