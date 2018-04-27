package org.nutz.weixin.bean.wxa.req;

import org.nutz.mvc.upload.TempFile;

/**
 * Created by Jianghao on 2018/4/27
 *
 * @howechiang
 */
public class ImgSecCheckReq extends BaseReq {

    /**
     * 要检测的图片文件，格式支持PNGJPEGJPGGIF, 像素不超过750x1334
     */
    private TempFile media;

    public TempFile getMedia() {
        return media;
    }

    public void setMedia(TempFile media) {
        this.media = media;
    }
}
