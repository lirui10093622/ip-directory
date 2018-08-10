package org.lr.util.ip.directory;

import lombok.Data;

/**
 * ip地址
 * @author neil
 * @email lirui10093622@163.com
 * @time 2018-08-10 14:40:46
 */
@Data
class IpAddress implements IpDirectory {

    private String ip;

    public IpAddress(String ip) {
        this.ip = ip;
    }

    @Override
    public boolean contains(String ip) {
        return this.ip.equals(ip);
    }
}