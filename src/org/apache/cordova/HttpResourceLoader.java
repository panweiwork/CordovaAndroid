package org.apache.cordova;

import java.io.IOException;

public interface HttpResourceLoader {
  public org.apache.cordova.CordovaResourceApi.OpenForReadResult open(String url) throws IOException ;

  public boolean accept(String url);
}
