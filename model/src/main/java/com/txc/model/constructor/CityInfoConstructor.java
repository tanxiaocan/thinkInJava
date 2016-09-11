package com.txc.model.constructor;

import com.google.common.collect.Lists;
import com.txc.model.CityInfo;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tanxiaocan on 2016/9/10.
 */
public class CityInfoConstructor {
    public static List<CityInfo> getCityInfoList(int num){
        List<CityInfo> cityInfoList = Lists.newArrayList();
        char preCityJp = 'a';
        char sufCityJp = 'Z';
        for (int i = 0; i < num; i++) {
            String cityJp = preCityJp++ + "" + sufCityJp++;
            CityInfo cityInfo = new CityInfo(num,"城市" + num,cityJp);
            cityInfoList.add(cityInfo);
        }
        return cityInfoList;
    }
}
