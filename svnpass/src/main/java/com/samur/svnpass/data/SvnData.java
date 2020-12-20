package com.samur.svnpass.data;

public class SvnData {
   /**
    * Constructor.
    */
   public SvnData() {}

   /**
    * Constructor.
    * @param servicePort
    * @param protocol
    * @param confuse
    * @param encryption
    */
   public SvnData(String servicePort, String protocol, String confuse, String encryption) {
      this.servicePort = servicePort;
      this.protocol = protocol;
      this.confuse = confuse;
      this.encryption = encryption;
   }

   public static String getFilePath() {
      return filePath;
   }

   public String getServicePort() {
      return servicePort;
   }

   public String getProtocol() {
      return protocol;
   }

   public String getConfuse() {
      return confuse;
   }

   public String getEncryption() {
      return encryption;
   }

   public static final String filePath = "/etc/shadowsocksr/user-config.json";
   private String servicePort;//服务端口
   private String protocol;//协议
   private String confuse;//混淆
   private String encryption;//加密方法
}
