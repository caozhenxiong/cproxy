package com.czx.cproxy.config;

import com.czx.cproxy.constants.Constants;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import io.netty.channel.epoll.EpollServerSocketChannel;
import io.netty.channel.socket.ServerSocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

import java.util.Map;

/**
 * @author caozhenxiong
 */
public class ChannelTypeConfig {
    public static final Map<String,Class<? extends ServerSocketChannel>> IO_CHANNEL_TYPES = Maps.newHashMap();

    public static ServerSocketChannel getServerSocketChannelClass(String ioType) {
        Class<? extends ServerSocketChannel> serverSocketChannelClass = NioServerSocketChannel.class;
        IO_CHANNEL_TYPES.put(Constants.EPOLL,EpollServerSocketChannel.class);
        ImmutableMap.copyOf(IO_CHANNEL_TYPES);
        return null;
    }
}
