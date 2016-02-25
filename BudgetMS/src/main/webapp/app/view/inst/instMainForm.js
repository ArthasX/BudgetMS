Ext.define('BudgetMS.view.inst.instMainForm', {
	extend : 'Ext.form.Panel',
	alias : 'widget.instMainForm',

	layout : {
		type : 'hbox',
		align : 'stretch'
	},
	border : false,
	items : [ {
		flex : 1,
		border : false,
		items : [ {
			xtype : 'textfield',
			name : 'instId',
			fieldLabel : '请示编号'
		}, {
			xtype : 'textfield',
			name : 'instContent',
			fieldLabel : '请示内容'
		}, {
			xtype : 'button',
			text : '查询',
			name : 'findInst'
	
		}, {
			xtype : 'button',
			text : '添加',
			id : 'showAddInst'
		
		}, {
			xtype : 'button',
			text : '修改',
			id : 'showUpdateInst'
			
		}, {
			xtype : 'button',
			text : '刪除',
			id : 'deleteInst'
			
		} ]
	}, {
		flex : 1,
		border : false,
		items : [ {
			xtype : 'textfield',
			name : 'instAmt',
			fieldLabel : '请示金额'
		}, {
			xtype : 'textfield',
			name : 'instStatus',
			fieldLabel : '请示状态'
		} ]
	}, {
		flex : 1,
		border : false,
		items : [ {
			xtype : 'textfield',
			name : 'instType',
			fieldLabel : '请示类型'
		} ]
	} ]

// ,
// {
// xtype : 'instList',
// flex : 3
// }

});