package com.csqf.zx.utils;

import com.aliyun.dysmsapi20170525.models.SendSmsRequest;
import com.aliyun.dysmsapi20170525.models.SendSmsResponse;
import com.aliyun.tea.TeaException;

public class SmsUtils {

    private static com.aliyun.dysmsapi20170525.Client createClient(String accessKeyId, String accessKeySecret) throws Exception {
        com.aliyun.teaopenapi.models.Config config = new com.aliyun.teaopenapi.models.Config()
                // 必填，您的 AccessKey ID
                .setAccessKeyId(accessKeyId)
                // 必填，您的 AccessKey Secret
                .setAccessKeySecret(accessKeySecret);
        // 访问的域名
        config.endpoint = "dysmsapi.aliyuncs.com";
        return new com.aliyun.dysmsapi20170525.Client(config);
    }

    //发送手机短信
    public static boolean sendMsg(String phone, String code) throws Exception {

        com.aliyun.dysmsapi20170525.Client client = createClient("LTAI5t8nZLx1z2zZw3TgByM5", "PgdKdOR2WmEdaDAmbKpJ4tlrHW0T6l");
        SendSmsRequest sendSmsRequest = new SendSmsRequest();

        sendSmsRequest.setPhoneNumbers(phone);
        sendSmsRequest.setTemplateCode("SMS_461570502");
        sendSmsRequest.setSignName("阿里哒哒");
        sendSmsRequest.setTemplateParam("{\"code\":\"" + code + "\"}");

        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        try {
            // 复制代码运行请自行打印 API 的返回值
            SendSmsResponse sendSmsResponse = client.sendSmsWithOptions(sendSmsRequest, runtime);

            System.out.println(sendSmsResponse.getStatusCode());
            System.out.println(sendSmsResponse.getBody().getCode());

        } catch (TeaException error) {
            // 如有需要，请打印 error
            com.aliyun.teautil.Common.assertAsString(error.message);
            error.printStackTrace();
        } catch (Exception _error) {
            TeaException error = new TeaException(_error.getMessage(), _error);
            // 如有需要，请打印 error
            com.aliyun.teautil.Common.assertAsString(error.message);
            _error.printStackTrace();
        }

        return true;
    }

    public static void main(String[] args) throws Exception {
      SmsUtils.sendMsg("15074447542","5088");
    }
}
