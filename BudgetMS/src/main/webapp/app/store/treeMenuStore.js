Ext.define('BudgetMS.store.treeMenuStore', {
	extend : 'Ext.data.TreeStore',
	root : {
		expanded : true,
		children : [ {
			text : "预算项目",
			leaf : true
		}, {
			text : "请示",
			expanded : true,
			children : [ {
				text : "测试1",
				leaf : true
			}, {
				text : "测试2",
				leaf : true
			} ]
		}, {
			text : "合同",
			leaf : true
		},
		{
			text : "发票",
			leaf : true
		}]
	}

})