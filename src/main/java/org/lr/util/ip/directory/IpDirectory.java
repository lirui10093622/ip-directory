package org.lr.util.ip.directory;

/**
 * ip字典,包含单个ip地址和ip网段两种具体形式
 *
 * @author neil
 * @email lirui10093622@163.com
 * @time 2018-08-10 14:41:12
 * @see  IpAddress
 * @see IpSegment
 */
public interface IpDirectory {

    /**
     * 检查是否包含某个ip地址
     *
     * @param ip
     * @return
     */
    boolean contains(String ip);
}