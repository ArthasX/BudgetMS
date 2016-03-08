/**
 * 请示表头
 * 
 */
var instDivideColumn = [ {
	header : '请示拆分编号',
	dataIndex : 'instDivideId',
	width : 150
}, {
	header : '请示编号',
	dataIndex : 'instId',
	width : 150
}, {
	header : '拆分编号',
	dataIndex : 'divideNo',
	width : 150
}, {
	header : '拆分金额',
	dataIndex : 'divideAmt'
}, {
	header : '项目信息编号',
	dataIndex : 'proInfoId'
}, {
	header : '备注',
	dataIndex : 'remark',

}, {

} ];

Ext.define('BudgetMS.view.instDivide.list', {
	extend : 'BudgetMS.view.ux.baseGrid',
	alias : 'widget.instDivideList',
	id : 'instDivideList',
	name : 'instDivide',// Ext.widget(name+'Edit') name+'Add'
	store : 'instDivideStore',
	border : false,
	// frame : true,// 渲染
	enableKeyNav : true,// 键盘控制
	columnLines : true,// 竖线
	tbar : {
		items : [ {
			xtype : 'instDivideTbarForm'
		} ]
	},
	dockedItems : [ {
		xtype : 'pagingtoolbar',
		store : 'instDivideStore',
		dock : 'bottom',
		displayInfo : true
	} ],
	initComponent : function() {
		this.columns = instDivideColumn;
		this.callParent(arguments);
	}

});
