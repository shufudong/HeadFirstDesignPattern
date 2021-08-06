/*
 * Licensed Materials - Property of ROOTCLOUD
 * THIS MODULE IS "RESTRICTED MATERIALS OF ROOTCLOUD"
 * (c) Copyright ROOTCLOUD Inc. 2019 All Rights Reserved
 *
 * The source code for this program is not published or
 * otherwise divested of its trade secrets
 */

package less_7;

public class Father implements IHandler {
  @Override
  public void handleMessage(IWomen women) {
    System.out.println("女儿的请示是："+women.getRequest());
    System.out.println("父亲的答复是：同意");
  }
}
