package nl.averythebird.glowyplayers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Reference {
  public static final String modID = "glowyplayers";

  // Method to get a logger with the modID included
  public static Logger getLogger(String subLogID) {
    final String logID = modID + ":" + subLogID;
    return LoggerFactory.getLogger(logID);
  }
}
