package org.lr.util.ip.directory;

import lombok.Data;
import org.apache.commons.net.util.SubnetUtils;

/**
 * ip网段
 *
 * @author neil
 * @email lirui10093622@163.com
 * @time 2018-08-10 14:42:41
 */
@Data
class IpSegment implements IpDirectory {

    private SubnetUtils.SubnetInfo subnet;

    public IpSegment(SubnetUtils.SubnetInfo ipSegment) {
        this.subnet = ipSegment;
    }

    @Override
    public boolean contains(String ip) {
        return subnet.isInRange(ip);
    }
}