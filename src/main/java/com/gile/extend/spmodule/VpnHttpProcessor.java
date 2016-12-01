package com.gile.extend.spmodule;

import android.text.TextUtils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * get the vpnPre from the server
 */

public class VpnHttpProcessor {

    /**
     * to get vpnPre and convert to VpnPref object
     */
    public VpnPref VpnHttpClient(){
        HttpURLConnection connection = null;
        try {
            URL url = new URL(VpnConstant.VPN_PRE_SERVER_URL);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Charset", "UTF-8");
            if(connection.getResponseCode() == 200){
                InputStream is = connection.getInputStream();
                String result = StringUtil.getStringFromInputStream(is);
                if(TextUtils.isEmpty(result)){
                    return null;
                }
                //
                JSONObject vpnJsonO = new JSONObject(result);
                VpnPref vpnPref = new VpnPref();
                // name
                vpnPref.setName(vpnJsonO.optString(VpnPref.NAME));
                // host
                vpnPref.setHost(vpnJsonO.optString(VpnPref.HOST));
                // localPort
                vpnPref.setLocalPort(vpnJsonO.optString(VpnPref.LOCAL_PORT));
                // remotePort
                vpnPref.setRemotePort(vpnJsonO.optString(VpnPref.REMOTE_PORT));
                // password
                vpnPref.setPassword(vpnJsonO.optString(VpnPref.PASSWORD));
                // protocal
                vpnPref.setProtocal(vpnJsonO.optString(VpnPref.PROTOCAL));
                // obfs
                vpnPref.setObfs(vpnJsonO.optString(VpnPref.OBFS));
                // obfs_param
                vpnPref.setObfs_param(vpnJsonO.optString(VpnPref.OBFS_PARAM));
                // method
                vpnPref.setMethod(vpnJsonO.optString(VpnPref.METHOD));
                // route
                vpnPref.setRoute(vpnJsonO.optString(VpnPref.ROUTE));
                // proxyApps
                vpnPref.setProxyApps(vpnJsonO.optBoolean(VpnPref.PROXY_APPS,false));
                // bypass
                vpnPref.setBypass(vpnJsonO.optBoolean(VpnPref.BYPASS,false));
                // udpdns
                vpnPref.setUdpdns(vpnJsonO.optBoolean(VpnPref.UDP_DNS,false));
                // dns
                vpnPref.setDns(vpnJsonO.optString(VpnPref.DNS));
                // china_dns
                vpnPref.setChina_dns(vpnJsonO.optString(VpnPref.CHINA_DNS));
                // ipv6
                vpnPref.setIpv6(vpnJsonO.optBoolean(VpnPref.IPV6,false));
                // individual
                vpnPref.setIndividual(vpnJsonO.optString(VpnPref.INDIVIDUAL));
                // myRoutes
                JSONArray myRJA = vpnJsonO.getJSONArray(VpnPref.MY_ROUTES);
                if(myRJA!=null&&myRJA.length()>0){
                  String[] myRoutes = new String[myRJA.length()];
                    for(int i=0;i<myRJA.length();i++){
                        myRoutes[i] = myRJA.optString(i);
                    }
                    vpnPref.setMyRoutes(myRoutes);
                }
                return vpnPref;
            }
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            return null;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            return null;
        } catch (JSONException e) {
            return null;
        } catch (Exception e){
            return null;
        } finally {
            if(connection!=null){
                connection.disconnect();
            }
        }
        return null;
    }
}
