Ext.define('BudgetMS.store.treeMenuStore', {
	extend : 'Ext.data.TreeStore',
	root : {
		expanded : true,
		children : [ {
			id:'budgetList',
			text : "预算项目",
			leaf : true
		}, {
			id:'instList',
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
			id:'contList',
			text : "合同",
			leaf : true
		},
		{
			id:'invoList',
			text : "发票",
			leaf : true
		}]
	}

})