var budgetInfoColumn = [ {
	header : '预算信息编号',
	dataIndex : 'budgetInfoId',
	width : 150
}, {
	header : '预算类型',
	dataIndex : 'budgetType',
	width : 150
}, {
	header : '预算金额',
	dataIndex : 'budgetAmt',
	width : 150
}, {
	header : '年份',
	dataIndex : 'year',
	width : 150
}, {
	header : '备注',
	dataIndex : 'remark',

} ];

Ext.define('BudgetMS.view.budget.info.list', {
	extend : 'BudgetMS.view.ux.baseGrid',
	alias : 'widget.budgetInfoList',
	id : 'budgetInfoList',
	name : 'budgetInfo',// Ext.widget(name+'Edit') name+'Add'
	store : 'budgetInfoStore',
	border : false,
	// frame : true,// 渲染
	enableKeyNav : true,// 键盘控制
	columnLines : true,// 竖线
	tbar : {
		items : [ {
			xtype : 'budgetInfoTbarForm'
		} ]
	},
	dockedItems : [ {
		xtype : 'pagingtoolbar',
		store : 'budgetInfoStore',
		dock : 'bottom',
		displayInfo : true
	} ],
	initComponent : function() {
		this.columns = budgetInfoColumn;
		this.callParent(arguments);
	}

});
