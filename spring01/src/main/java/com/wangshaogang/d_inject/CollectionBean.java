/**
 * 复杂类型注入
 *
 * @author 王少刚
 * @create 2018-11-15 13:25
 */
package com.wangshaogang.d_inject;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;
import java.util.Properties;

@Getter
@Setter
@ToString
public class CollectionBean {
	private Object arr[];
	private List list;
	private Map map;
	private Properties prop;
}
