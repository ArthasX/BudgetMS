Ext.define('BudgetMS.view.inst.add', {
	extend : 'BudgetMS.view.inst.baseInstWin',
	alias : 'widget.instAdd',
	title : '请示新增',
	layout : 'fit',
	autoShow : true,
	initComponent : function() {
		this.items = instFormItems;
		this.buttons = [ {
			xtype : 'doAddBtn',
			text : '增加',
			name : 'insertInst',
			action : 'inst/insertInst.do'
		}, {
			text : '取消',
			scope : this,
			handler : this.close
		} ];
		this.callParent(arguments);
		this.down('form').getForm().findField('instId').setValue(genInstId());
	}
});
