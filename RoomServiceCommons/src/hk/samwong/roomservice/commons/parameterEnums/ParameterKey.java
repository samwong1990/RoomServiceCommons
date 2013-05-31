package hk.samwong.roomservice.commons.parameterEnums;

public enum ParameterKey {
	// Client to server:
	CLASSIFIER,		// specifies which classifier(s) to be used
	SPECIAL_REQUESTS_FOR_SPECFIC_CLASSIFIER,	// expects a serialized string to string map 
	OPERATION,		// specifies intent: 
	OBSERVATION, 	// stores the wifi fingerprint
	ROOM,			// room name, of course
	BATCH_TRAINING_DATA,	// self explanatory
	INSTANCE,		// when validating classification, this is the corresponding instance
	AUENTICATION_DETAILS,	// self explanatory
	VALIDATION_STATISTICS,		// For Statistics
	// Server to client:
	RETURN_CODE, 	// See Enum ReturnCode
	ERROR_EXPLANATION, // String with error details
	
}