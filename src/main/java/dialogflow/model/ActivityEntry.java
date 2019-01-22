package dialogflow.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class ActivityEntry {

	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	private String activity;
	
	private String Amount;
	
	private Timestamp timestamp;
}
