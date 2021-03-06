package com.wushuangtech.gamelive.websocket;

/**
 * Created by 刘景 on 2017/05/11.
 */
@SuppressWarnings("unused")
public class SocketConstants {

    public static final String FIELD_TYPE = "messageType";

    /**
     * 点亮❤
     */
    public static final String EVENT_LIGHT_HEART = "LightHeart";

    /**
     * 公聊消息
     */
    public static final String EVENT_PUB_MSG = "barrage_req";
    public static final String EVENT_PUB_MSG_RSP = "barrage_res";

    /**
     * 登录到Socket
     */
    public static final String EVENT_LOGIN = "join_req";

    public static final String EVENT_LOGIN_RSP = "join_res";


    /**
     * 登出Socket
     */
    public static final String EVENT_LOGOUT = "leave_req";

    public static final String EVENT_LOGOUT_RSP = "leave_res";

    /**
     * 系统欢迎
     */
    public static final String EVENT_SYSWElCOME = "join_notify_res";

    /**
     * 客户端上行心跳包，固定时间间隔重传。
     */
    public static final String EVENT_PONG = "heartbeat_req";

    /**
     * 客户端心跳包返回数据
     */
    public static final String EVENT_PONG_RSP = "heartbeat_res";

    /**
     * 送礼
     */
    public static final String EVENT_SEND_GIFT = "gift_req";
    public static final String EVENT_SEND_GIFT_RSP = "gift_res";
    public static final String EVENT_NOTIFY_GIFT_RSP = "gift_notify_res";

    /**
     * 错误消息
     */
    public static final String EVENT_ERROR = "error";

    /**
     * 连麦操作
     */
    public static final String APPLY_MIC_REQUEST = "lm_list_req";//观众端连麦请求
    public static final String APPLY_MIC_REQUEST_REQ = "lm_agree_req";//主播同意连麦


    public static final String APPLY_MIC_RESPONSE = "lm_list_res";//观众请求后主播端连麦响应,获取一个list集合
    public static final String APPLY_MIC_RESPONSE_RSP = "lm_agree_res";//观众收到主播连麦的响应


    /**
     * 断开连麦
     */

    public static final String DISCONNECT_LM_REQUEST = "close_call_req";
    public static final String DISCONNECT_LM_REQUEST_RSP = "close_call_res";
}
