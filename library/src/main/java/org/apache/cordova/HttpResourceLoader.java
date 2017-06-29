package org.apache.cordova;

import java.io.IOException;

public interface HttpResourceLoader {
  public CordovaResourceApi.OpenForReadResult open(String url) throws IOException ;

  public boolean accept(String url);
}
