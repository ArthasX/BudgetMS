Ext.define('BudgetMS.view.tender.baseTenderWin', {
	extend : 'Ext.window.Window',
	name : 'tender',
	layout : 'fit',
	autoShow : true,
	initComponent : function() {
		this.items = tenderFormItems;
		this.callParent(arguments);
	}
});
var tenderFormItems = [ {
	flex : 1,
	xtype : 'form',
	layout : 'auto',
	items : [ {
		xtype : 'textfield',
		name : 'tenderId',
		fieldLabel : '招标编号',
		allowBlank : false
	}, {
		xtype : 'textfield',
		name : 'instDivideId',
		fieldLabel : '请示拆分编号',
		allowBlank : false
	}, {
		xtype : 'textfield',
		name : 'tenderAmt',
		fieldLabel : '中标金额',
		vtype : 'money',
		allowBlank : false
	}, {
		xtype : 'textfield',
		name : 'company',
		fieldLabel : '中标公司',
		allowBlank : false
	}, {
		xtype : 'textfield',
		name : 'remark',
		fieldLabel : '项目名称',
		allowBlank : false
	} ]
} ];