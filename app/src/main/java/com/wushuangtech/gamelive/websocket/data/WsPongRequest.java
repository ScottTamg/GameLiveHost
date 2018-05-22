package com.wushuangtech.gamelive.websocket.data;


/**
 * Created by 刘景 on 2017/05/11.
 */

public class WsPongRequest extends WsRequest{

    private WsPongRequestData data;

    public WsPongRequestData getData() {
        return data;
    }

    public void setData(WsPongRequestData data) {
        this.data = data;
    }

    public static class WsPongRequestData{
        private String roomId ;
        private String userId ;
        private String isMaster ;

        public String getRoomId() {
            return roomId;
        }

        public void setRoomId(String roomId) {
            this.roomId = roomId;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getIsMaster() {
            return isMaster;
        }

        public void setIsMaster(String isMaster) {
            this.isMaster = isMaster;
        }



    }

}
