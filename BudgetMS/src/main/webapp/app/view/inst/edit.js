Ext.define('BudgetMS.view.inst.edit', {
	extend : 'BudgetMS.view.inst.baseInstWin',
	alias : 'widget.instEdit',
	title : '请示修改',
	layout : 'fit',
	autoShow : true,
	initComponent : function() {
		this.items = instFormItems;
		this.buttons = [ {
			xtype : 'doUpdBtn',
			text : '更新',
			name : 'updateInst',
			action : 'inst/updateInst.do'
		}, {
			text : '取消',
			scope : this,
			handler : this.close
		} ]

		this.callParent(arguments);
		this.down('form').getForm().findField('instId').readOnly = true;
	}
});