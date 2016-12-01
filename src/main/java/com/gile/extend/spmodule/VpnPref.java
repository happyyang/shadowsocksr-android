package com.gile.extend.spmodule;

import java.util.ArrayList;

/**
 * vpn pref from servers
 */

public class VpnPref {
    public static final String NAME = "name";
    public static final String HOST = "host";
    public static final String LOCAL_PORT = "localPort";
    public static final String REMOTE_PORT = "remotePort";
    public static final String PASSWORD = "password";
    public static final String PROTOCAL = "protocal";
    public static final String OBFS = "obfs";
    public static final String OBFS_PARAM = "obfs_param";
    public static final String METHOD = "method";
    public static final String ROUTE = "route";
    /**
     * value type is boolean
     */
    public static final String PROXY_APPS = "proxyApps";
    /**
     * value type is boolean
     */
    public static final String BYPASS = "bypass";
    /**
     * value type is boolean
     */
    public static final String UDP_DNS = "udpdns";
    public static final String DNS = "dns";
    public static final String CHINA_DNS = "china_dns";
    /**
     * value type is boolean
     */
    public static final String IPV6 = "ipv6";
    public static final String INDIVIDUAL = "individual";
    /**
     * value type is String[]
     */
    public static final String MY_ROUTES = "myRoutes";
    //
    private String name;
    private String host;
    private String localPort;
    private String remotePort;
    private String password;
    private String protocal;
    private String obfs;
    private String obfs_param;
    private String method;
    private String route;
    private boolean proxyApps;
    private boolean bypass;
    private boolean udpdns;
    private String dns;
    private String china_dns;
    private boolean ipv6;
    private String individual;
    private String[] myRoutes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getLocalPort() {
        return localPort;
    }

    public void setLocalPort(String localPort) {
        this.localPort = localPort;
    }

    public String getRemotePort() {
        return remotePort;
    }

    public void setRemotePort(String remotePort) {
        this.remotePort = remotePort;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProtocal() {
        return protocal;
    }

    public void setProtocal(String protocal) {
        this.protocal = protocal;
    }

    public String getObfs() {
        return obfs;
    }

    public void setObfs(String obfs) {
        this.obfs = obfs;
    }

    public String getObfs_param() {
        return obfs_param;
    }

    public void setObfs_param(String obfs_param) {
        this.obfs_param = obfs_param;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public boolean isProxyApps() {
        return proxyApps;
    }

    public void setProxyApps(boolean proxyApps) {
        this.proxyApps = proxyApps;
    }

    public boolean isBypass() {
        return bypass;
    }

    public void setBypass(boolean bypass) {
        this.bypass = bypass;
    }

    public boolean isUdpdns() {
        return udpdns;
    }

    public void setUdpdns(boolean udpdns) {
        this.udpdns = udpdns;
    }

    public String getDns() {
        return dns;
    }

    public void setDns(String dns) {
        this.dns = dns;
    }

    public String getChina_dns() {
        return china_dns;
    }

    public void setChina_dns(String china_dns) {
        this.china_dns = china_dns;
    }

    public boolean isIpv6() {
        return ipv6;
    }

    public void setIpv6(boolean ipv6) {
        this.ipv6 = ipv6;
    }

    public String getIndividual() {
        return individual;
    }

    public void setIndividual(String individual) {
        this.individual = individual;
    }

    public String[] getMyRoutes() {
        return myRoutes;
    }

    public void setMyRoutes(String[] myRoutes) {
        this.myRoutes = myRoutes;
    }
}
