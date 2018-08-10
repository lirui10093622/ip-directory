package org.lr.util.ip.directory;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.net.util.SubnetUtils;

/**
 * @author neil
 * @email lirui10093622@163.com
 * @time 2018-08-10 14:19:19
 */
@Slf4j
class IpUtil {

    public static IpDirectory convert(String ip) {
        return isIpSegment(ip) ? parseIpSegment(ip) : new IpAddress(ip);
    }

    private static boolean isIpSegment(String ip) {
        final String subnetDelimiter = "/";
        return ip.contains(subnetDelimiter);
    }

    private static IpDirectory parseIpSegment(String ip) {
        try {
            return new IpSegment(new SubnetUtils(ip).getInfo());
        } catch (Exception e) {
            log.error("子网解析异常", e);
            return new EmptyIpDirectory();
        }
    }
}