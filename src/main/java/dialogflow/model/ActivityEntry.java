package dialogflow.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@JsonIgnoreProperties
@Entity
@Data
public class ActivityEntry {

	@Id
	@GeneratedValue
	private Long id;
	
	private Long userID;
	
	private String name;
	
	private String activity;
	
	private String Amount;
	
	private Timestamp timestamp;
}
