package net.engining.control.api.key;

import net.engining.control.api.ContextKey;
import net.engining.control.api.KeyDefinition;

@KeyDefinition(
		name = "交易流水的唯一序号"
	)
public interface TransIdKey extends ContextKey<String>{

}
