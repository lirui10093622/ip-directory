package org.lr.util.ip.directory;

import java.util.HashSet;
import java.util.Set;

/**
 * ip字典工厂
 *
 * @author neil
 * @email lirui10093622@163.com
 * @time 2018-08-10 15:11:08
 */
public class IpDirectoryFactory {

    public static IpDirectory buildIpDirectory(Set<String> ip) {
        IpDirectoryImpl directory = new IpDirectoryImpl();
        ip.forEach(u -> directory.add(IpUtil.convert(u)));
        return directory;
    }

    private static class IpDirectoryImpl implements IpDirectory {

        private Set<IpDirectory> directories = new HashSet<>();

        public void add(IpDirectory directory) {
            directories.add(directory);
        }

        @Override
        public boolean contains(String ip) {
            for (IpDirectory directory : directories) {
                if (directory.contains(ip)) {
                    return true;
                }
            }
            return false;
        }
    }
}