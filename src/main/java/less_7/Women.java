/*
 * Licensed Materials - Property of ROOTCLOUD
 * THIS MODULE IS "RESTRICTED MATERIALS OF ROOTCLOUD"
 * (c) Copyright ROOTCLOUD Inc. 2019 All Rights Reserved
 *
 * The source code for this program is not published or
 * otherwise divested of its trade secrets
 */

package less_7;

public class Women implements IWomen{

  /**
   * 通过一个Integer类型参数来描述妇女的个人状态
   * 1 - 未出嫁
   * 2 - 出嫁
   * 3 - 夫亡
   */
  private Integer type = 0;

  /**
   * 妇女的请示
   */
  private String request = "";

  @Override
  public Integer getType() {
    return this.type;
  }

  @Override
  public String getRequest() {
    return this.request;
  }
}
