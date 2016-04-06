package com.pheu.service;

import java.util.List;
import com.pheu.common.ThriftServerInfo;;


public interface QServiceDiscover {
	public void start() throws ServiceDiscoveryException;
	public void close() throws ServiceDiscoveryException;
	public List<ThriftServerInfo> allServices();
	//public Optional<Node<P>> nextService();
}
