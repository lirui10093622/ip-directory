package org.lr.util.ip.directory.test;

import org.lr.util.ip.directory.IpDirectory;
import org.lr.util.ip.directory.IpDirectoryFactory;
import com.google.common.collect.Sets;
import org.apache.commons.net.util.SubnetUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author neil
 * @email lirui10093622@163.com
 * @time 2018-08-10 15:24:57
 */
public class IpFactoryTest {

    @Test
    public void testFactory() {
        IpDirectory directory = IpDirectoryFactory.buildIpDirectory(Sets.newHashSet("192.168.0.1", "202.123.0.0/16"));
        Assert.assertTrue(directory.contains("192.168.0.1"));
        Assert.assertTrue(directory.contains("202.123.1.1"));
        Assert.assertFalse(directory.contains("202.122.1.1"));
    }

    @Test
    public void testSubnetUtil() {
        boolean isInRange = new SubnetUtils("202.123.0.0/16").getInfo().isInRange("202.122.1.1");
        Assert.assertFalse(isInRange);
    }
}