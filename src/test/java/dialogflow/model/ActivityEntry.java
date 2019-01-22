package dialogflow.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ActivityEntry {

	@Id
	@GeneratedValue
	@Data
	private Long id;
	
	private String name;
	
	private String activity;
	
	private String Amount;
	
	private Timestamp timestamp;
}
