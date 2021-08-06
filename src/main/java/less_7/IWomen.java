/*
 * Licensed Materials - Property of ROOTCLOUD
 * THIS MODULE IS "RESTRICTED MATERIALS OF ROOTCLOUD"
 * (c) Copyright ROOTCLOUD Inc. 2019 All Rights Reserved
 *
 * The source code for this program is not published or
 * otherwise divested of its trade secrets
 */

package less_7;

/**
 * 女性接口.
 */
public interface IWomen {

  /**
   * 获取个人状态 .
   * @return
   */
  Integer getType();

  /**
   * 获得个人请示，你要干什么？出去逛街？约会？还是看电影？
   * @return
   */
  String getRequest();
}
