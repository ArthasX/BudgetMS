Ext.define('BudgetMS.store.treeMenuStore', {
	extend : 'Ext.data.TreeStore',
	root : {
		expanded : true,
		children : [ {
			id:'budgetList',
			name:'budget',
			text : "预算",
			leaf : true
		}, {
			id:'proList',
			name:'pro',
			text : "项目",
			leaf : true
		}, {
			id:'instList',
			name:'inst',
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
			name:'cont',
			text : "合同",
			leaf : true
		},
		{
			id:'invoList',
			name:'invo',
			text : "发票",
			leaf : true
		}]
	}

})