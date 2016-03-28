var tenderColum = [ {
	header : '招标编号',
	dataIndex : 'tenderId'
}, {
	header : '请示拆分编号',
	dataIndex : 'instDivideId'
}, {
	header : '中标金额',
	dataIndex : 'tenderAmt'
}, {
	header : '中标公司',
	dataIndex : 'company'
}, {
	header : '项目名称',
	dataIndex : 'remark',

} ];

Ext.define('BudgetMS.view.tender.list', {
	extend : 'BudgetMS.view.ux.baseGrid',
	alias : 'widget.tenderList',
	id : 'tenderList',
	name : 'tender',// Ext.widget(name+'Edit') name+'Add'
	store : 'tenderStore',
	border : false,
	// frame : true,// 渲染
	enableKeyNav : true,// 键盘控制
	columnLines : true,// 竖线
	tbar : {
		items : [ {
			xtype : 'tenderTbarForm'
		} ]
	},
	dockedItems : [ {
		xtype : 'pagingtoolbar',
		store : 'tenderStore',
		dock : 'bottom',
		displayInfo : true
	} ],
	initComponent : function() {

		this.columns = tenderColum;
		this.callParent(arguments);

		// Ext.apply(this.down('pagingToolbar').store,Ext.create('BudgetMS.store.tenderStore'));
	}

});
