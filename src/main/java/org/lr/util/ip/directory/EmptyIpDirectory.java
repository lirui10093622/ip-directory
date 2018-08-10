package org.lr.util.ip.directory;

/**
 * 空的ip字典
 *
 * @author neil
 * @email lirui10093622@163.com
 * @time 2018-08-10 15:49:02
 */
class EmptyIpDirectory implements IpDirectory {

    @Override
    public boolean contains(String ip) {
        return false;
    }
}